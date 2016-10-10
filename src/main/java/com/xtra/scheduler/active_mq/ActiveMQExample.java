package com.xtra.scheduler.active_mq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ScheduledMessage;

import javax.jms.*;

public class ActiveMQExample {


    public static void main(String[] args) throws Exception {
/*        HelloWorldProducer producer = new HelloWorldProducer();
        HelloWorldConsumer consumer = new HelloWorldConsumer();

        Thread threadProducer = new Thread(producer);
        threadProducer.start();

        Thread threadConsumer = new Thread(consumer);
        threadConsumer.start();*/

        HelloWorldConsumer consumer = new HelloWorldConsumer();
        Thread threadConsumer = new Thread(consumer);
        threadConsumer.start();

        try {
            final int COUNT = 10;

            // Create a ConnectionFactory
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://DEL1NB10464:61616");
            // Create a Connection
            Connection connection = connectionFactory.createConnection();
            connection.start();

            // Create a Session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // Create the destination (Topic or Queue)
            Destination destination = session.createQueue("DemoQueue");

            MessageProducer producer = session.createProducer(destination);
            TextMessage message = session.createTextMessage("test msg");
            long time = 1000;
            message.setStringProperty(ScheduledMessage.AMQ_SCHEDULED_CRON, "* * * * *");
            message.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, time);
            message.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_PERIOD, 500);
            message.setIntProperty(ScheduledMessage.AMQ_SCHEDULED_REPEAT, COUNT - 1);

            producer.send(message);
            producer.close();
            // Clean up
            session.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }


    private static class HelloWorldConsumer implements Runnable, ExceptionListener {
        public void run() {
            try {

                // Create a ConnectionFactory
                ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://DEL1NB10464:61616");

                // Create a Connection
                Connection connection = connectionFactory.createConnection();
                connection.start();

                connection.setExceptionListener(this);

                // Create a Session
                Session session = connection.createSession(false,
                        Session.AUTO_ACKNOWLEDGE);

                // Create the destination (Topic or Queue)
                Destination destination = session.createQueue("DemoQueue");

                // Create a MessageConsumer from the Session to the Topic or
                // Queue
                MessageConsumer consumer = session.createConsumer(destination);

                // Wait for a message
                Message message = consumer.receive(1000);

                if (message instanceof TextMessage) {
                    TextMessage textMessage = (TextMessage) message;
                    String text = textMessage.getText();
                    System.out.println("Received: " + text);
                } else {
                    System.out.println("Received: " + message);
                }

                //consumer.close();
                //session.close();
                //connection.close();
            } catch (Exception e) {
                System.out.println("Caught: " + e);
                e.printStackTrace();
            }
        }

        public synchronized void onException(JMSException ex) {
            System.out.println("JMS Exception occured.  Shutting down client.");
        }
    }
}

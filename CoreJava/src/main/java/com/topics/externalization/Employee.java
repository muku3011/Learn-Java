package com.topics.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Key differences between Serializable and Externalizable
 *
 * Implementation :
 * Unlike Serializable interface which will serialize the variables in object with just by implementing interface,
 * here we have to explicitly mention what fields or variables you want to serialize.
 *
 * Methods :
 * Serializable is marker interface without any methods. Externalizable interface contains two methods: writeExternal() and readExternal().
 *
 * Process:
 * Default Serialization process will take place for classes implementing Serializable interface.
 * Programmer defined Serialization process for classes implementing Externalizable interface.
 *
 * Backward Compatibility and Control:
 * If you have to support multiple versions, you can have full control with Externalizable interface.
 * You can support different versions of your object. If you implement Externalizable, it’s your responsibility to serialize super class.
 *
 * public No-arg constructor:
 * Serializable uses reflection to construct object and does not require no arg constructor.
 * But Externalizable requires public no-arg constructor.
 */
class Employee implements Externalizable {

    private String name;
    private String address;
    private transient int ssn;
    private int number;

    public Employee() {
        //
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //Order is important
        out.writeObject(this.getName());
        out.writeObject(this.getAddress());
        out.writeInt(this.getSsn());
        out.writeInt(this.getNumber());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //Order is important
        this.setName((String) in.readObject());
        this.setAddress((String) in.readObject());
        this.setSsn(in.readInt());
        this.setNumber(in.readInt());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
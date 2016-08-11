package com.ocp.topics.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class ExternalizedEmployee implements Externalizable {

    private String name;
    private String address;
    private transient int ssn;
    private int number;

    public ExternalizedEmployee() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //Order is important
        out.writeObject(this.getName());
        out.writeObject(this.getAddress());
        //out.writeInt(this.getSsn());
        out.writeInt(this.getNumber());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //Order is important
        this.setName((String) in.readObject());
        this.setAddress((String) in.readObject());
        //this.setSsn(in.readInt());
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
package com.topics.creational;

/**
 * In Factory pattern, we create object without exposing the creation
 * logic to the client and refer to newly created object using a common interface.
 */
class Factory {

    OS getInstance(String objectType) {
        switch (objectType) {
            case "Android":
                return new AndroidOS();
            case "iOS":
                return new iOS();
            case "Windows":
                return new WindowsOS();
            default:
                System.out.println("Type not defined returning null");
                return null;
        }
    }

}

interface OS {

    void spec();
}

class AndroidOS implements OS {

    public void spec() {
        System.out.println("Object for Android OS");
    }

}

class iOS implements OS {

    public void spec() {
        System.out.println("Object for Apple OS");
    }

}

class WindowsOS implements OS {

    public void spec() {
        System.out.println("Object for Windows OS");
    }

}

class RunFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();

        OS operatingSystem = factory.getInstance("iOS");
        operatingSystem.spec();

        operatingSystem = factory.getInstance("Android");
        operatingSystem.spec();

        operatingSystem = factory.getInstance("Windows");
        operatingSystem.spec();
    }
}
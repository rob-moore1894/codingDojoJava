import java.util.Random;

public class ExceptionDemo {
    // Since our applications will almost never be self-contained, we will eventually have to venture out of our code and make some risky calls. We might be making a call to a database, trying to read or write to a file, or even just using a class written by someone else - all of these are exceptional situations that could cause errors that would bring our program to a stop. Most code you will interact with is kind enough to know when a risky operation is happening and will declare that it might throw an exception of a certain type.
    
    // For example - you ask a friend if they could deliver a message for you, and they said, "sure, but my car might run out of gas - if it does, I'll call you and tell you." In that scenario, your friend delivering the message is the risky operation, the car running out of gas is the exceptional situation, and their calling you is the throwing of the exception

    // Create the Exception
    static class OutOfGasException extends Exception{}
    // Create the Unreliable Friend
    static class UnreliableFriend {
        public boolean deliverMessage() throws OutOfGasException{
            Random r = new Random();
            boolean hasGas = r.nextBoolean();
            if (hasGas) {
                return true;
            }
            throw new OutOfGasException();
        }
    }

    // Try/Catch - The "try" statement will try out the code and then catch any "exceptional" events
    public static void main(String[] args) {
        UnreliableFriend friend = new ExceptionDemo.UnreliableFriend();
        try{
            friend.deliverMessage();
            System.out.println("The message was delivered");
        } 
        catch (OutOfGasException e) {
            System.out.println("I ran out of gas...");
            // back-up plan here
        }
    }

    // Since we know that UnreliableFriends might run out of gas, we come up with a back-up plan if that happens. So we try out delivering the message through our friend, and we catch any exceptions that the friend throws.

    //This is exactly how it would work, except it would be some sort of database connection, file writing or reading, or some other sort of call that could result in an error. Keep in mind that these are for exceptional situations, and even though some language might encourage the use of try/catch blocks for control flow, Java is not one of them.
} 

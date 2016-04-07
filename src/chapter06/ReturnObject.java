package chapter06;

/**
 * This class demonstrates returning an object from methods.
 */
public class ReturnObject {
    String msg;
    int code;
    private String[] messages = { "Message 1", "Message 2", "Message 3"};
    private int[] messageCodes = { 1, 2, 3 };

    ReturnObject() { }

    ReturnObject(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }
    // This method returns a new object:
    ReturnObject getReturnObject(int i) {
         if(i >= 0 & i < messages.length) {
             return new ReturnObject(messages[i], messageCodes[i]);
         }
        else {
             return new ReturnObject("Unknown Message", -1);
         }
     }

    public static void main(String[] args) {
        ReturnObject obj = new ReturnObject();
        obj = obj.getReturnObject(2);
        System.out.printf("Msg: %s | Code: %d%n", obj.msg, obj.code);
        obj = obj.getReturnObject(42);
        System.out.printf("Msg: %s | Code: %d%n", obj.msg, obj.code);
    }
}

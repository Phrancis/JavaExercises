package chapter07.Finality;

/**
 * Demonstrate the use of final data members, a.k.a. constants.
 */
public class FinalDataMembers {
    final int CODE_A = 0;
    final int CODE_B = 1;
    final int CODE_C = 2;
    final String[] messages = {
            "Message A",
            "Message B",
            "Message C"
    };
    String getMessage(int code) {
        if(code >= 0 & code < messages.length) {
            return messages[code];
        }
        return "Unknown";
    }
    // DEMO
    public static void main(String[] ags) {
        FinalDataMembers f = new FinalDataMembers();
        System.out.println(f.getMessage(f.CODE_A));
        System.out.println(f.getMessage(f.CODE_B));
        System.out.println(f.getMessage(f.CODE_C));
        System.out.println(f.getMessage(5));
    }
}

public class RevserseString {
    public static void main(String[] args) {
        String m = "mounik";

        String rev ="";

        char [] charArray=m.toCharArray();

        for (int i=charArray.length-1;i>=0;i--){
            rev=rev+charArray[i];
        }
        System.out.println(rev);
      }
    }


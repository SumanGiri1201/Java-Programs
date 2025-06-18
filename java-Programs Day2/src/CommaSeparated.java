public class CommaSeparated {
        public static void main(String[] args)
        {
            String input="Welcome,to,Java Session ,Session Session";
            String[] words=input.split(",");
            for(int i=0;i<words.length;i++)
            {

                System.out.println(words[i]);

            }
        }
    }

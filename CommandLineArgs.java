package Java;

public class CommandLineArgs {
    public static void main(String[] args) {
        int low = Integer.parseInt(args[0]);
        int upp = Integer.parseInt(args[1]);
        for(int i = low; i < upp; ++i)
        {
            int flag=0;
            for(int j = 2; j <= Math.sqrt(i); ++j)
            {
                if(i%j == 0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.println(i);
            }
        }
    }
}

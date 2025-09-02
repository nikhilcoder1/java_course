class Device
{
    public void music()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int num)
    {
        if(num >= 10)
            return "Pen";

        return "No Pen";
    }
}

public class Methods
{
    public static void main(String[] args)
    {
        int cost = 5;
        Device dev = new Device();
        dev.music();
        System.out.println("Output : " + dev.getMeAPen(cost));
    }
}


// Method Overloading ( SAME NAME BUT DIFFERENT PARAMETERS )

// STACK and HEAP
package Dz_Display;

// import Dz_Display.IsNum;
// import Dz_Display.Semaphore;

public class Work implements Runnable
{
    Semaphore semaphore;   
    @Override 
    public void run() 
    {
        IsNum isNum = new IsNum();
        isNum.edu1();
        isNum.edu2();
        isNum.edu8();

        double[] led1 = {0,0,1,0,0,1,0,1};
        double[] led7 = {1,0,1,0,0,1,0,1};

        isNum.test(led1);
        isNum.test(led7);

    }

    private void Sem()
    {
        semaphore = new Semaphore();
        System.out.println(semaphore.neuron);

        semaphore.goRed();
        semaphore.goGreen();

        System.out.println(" ----- ");
        for (int i = 0; i < 100; i++) {
            semaphore.eduStep();
        }
        System.out.println(semaphore.neuron);
        semaphore.goRed();
        semaphore.goGreen();
    }
}

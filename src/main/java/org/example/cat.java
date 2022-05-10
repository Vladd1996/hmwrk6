package org.example;

public class cat extends animal
{
    public int length_of_run;
    public cat(String name, int length_of_run)
    {
        super(name);
        if(length_of_run>200)this.length_of_run=200;
        if(length_of_run<0)this.length_of_run=0;
        this.length_of_run = length_of_run;
    }
    public void run()
    {
        System.out.println("Cat runs "+length_of_run+" meters");
    }
}

package org.example;

public class dog extends animal
{
    public int length_of_run,length_of_swim;
    public dog(String name,int length_of_run,int length_of_swim)
    {
        super(name);
        if(length_of_run>200)this.length_of_run=200;
        else if (length_of_run<0)this.length_of_run=0;
        else this.length_of_run = length_of_run;
        if(length_of_swim>10)this.length_of_swim=10;
        else if(length_of_swim<0)this.length_of_swim=0;
        else this.length_of_swim = length_of_swim;
    }
    public void run()
    {
        System.out.println("dog runs "+length_of_run+" meters");
    }
    public void swim()
    {
        System.out.println("dog swim "+length_of_swim+" meters");
    }
}

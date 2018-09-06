class calculator

{

void add(int i , int j)
{
int k = i + j;
System.out.println("Sum for method add is " + k);

}

void mul(int i, int j)
{
int k = i*j;
System.out.println("multiplication for method mul is " +k);

}

public static void main(String[] args)

{

calculator a = new calculator();

a.add(60,60);
a.mul(50,50);

}

}



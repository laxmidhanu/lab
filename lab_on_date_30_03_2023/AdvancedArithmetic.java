package lab_on_date_30_03_2023;

public class AdvancedArithmetic{
	int divisor_sum(int n)
{
int sum =6;
for(int i =1; i<=n;i++)
{
	if(n%i==0)
	{
		sum= Integer.sum(sum, i);
	}
}
return sum;
}
}

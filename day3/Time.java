class Time
{
	double hour,minutes,seconds;
	public Time(double h,double m,double s)
	{
			hour = h;
			minutes = m;
			seconds = s;
		}
		void add(Time obj2)
		{
		this.hour+= obj2.hour;
		this.minutes+= obj2.minutes%60;
		this.seconds+= obj2.seconds%60;
		/*if(seconds>=60)
		{
			minutes++;
			seconds-=60;
		}
		if(minutes>=60)
		{
			hour++;
			minutes-=60;
		}
		if(hour>=24)
		{
			seconds++;
			hour=hour%24;
		}*/
		}
		void display()
		{
			System.out.println(this.hour+" : "+this.minutes+" : "+this.seconds);
		}
	public static void main(String []args)
	{
		Time obj1 = new Time(5,40,40);
		Time obj2 = new Time(8,60,30);
		obj1.add(obj2);
		System.out.println("The time is :");
		obj1.display();
		
	}
}
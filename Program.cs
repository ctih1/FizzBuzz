using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace FizzBuzz
{
	/// <summary>
	/// Fizz buzz is a group word game for children to teach them about division.
	/// Players take turns to count incrementally, 
	/// replacing any number divisible by three with the word "fizz",
	/// and any number divisible by five with the word "buzz",
	/// and any number divisible by both 3 and 5 with the word "fizzbuzz"
	/// </summary>
	class Program
	{
		static void Main(string[] args)
		{
			FizzBuzz(100);
			Thread.Sleep(15000);
		}
		private static void FizzBuzz(int n)
		{
			for(int i = 1; i < n; i++)
			{
				if(i%3==0 && i%5==0) { Console.WriteLine("FizzBuzz");}
				else if(i%5==0) {Console.WriteLine("Buzz");}
				else if (i % 3 == 0) {Console.WriteLine("Fizz");}
				else {Console.WriteLine(i);}
			}
		}
	}
}

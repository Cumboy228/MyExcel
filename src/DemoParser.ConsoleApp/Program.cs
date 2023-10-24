using System.Runtime.CompilerServices;
using System.Xml;
using Antlr4.Runtime;
using DemoParser.ConsoleApp;

Calculator.GlobalScope.Add("A1", 1);
Calculator.GlobalScope.Add("B1", 2);
Calculator.GlobalScope.Add("C1", 5);
Calculator.GlobalScope.Remove("C1");

while(true)
{
  Console.WriteLine("Enter expression: ");
  var expression = Console.ReadLine();

  try
  {
    if(expression is null || expression.Trim().ToLower() == "exit")
    {
        break;
    } else
    Console.WriteLine(":" + Calculator.Evaluate(expression));
  }
  catch(ArgumentException e)
  {
    Console.WriteLine(e.Message);
  }
  catch(DivideByZeroException e)
  {
    Console.WriteLine("Invalid expression: attempt to divide by zero");
  }
}

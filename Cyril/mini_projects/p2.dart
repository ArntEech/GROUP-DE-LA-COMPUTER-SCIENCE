import 'dart:io';

void main() {
  print("Welcome to the Tip Calculator!");
  stdout.write("What was the total bill: \$");
  double totalBill = double.parse(stdin.readLineSync()!);

  stdout.write("What percentage tip would you like to give? 10, 12, or 15: ");
  int tipPercentage = int.parse(stdin.readLineSync()!);

  stdout.write("How many people to split the bill? ");
  int people = int.parse(stdin.readLineSync()!);

  double tip = totalBill * (tipPercentage / 100);
  double total = totalBill + tip;
  double eachPerson = total / people;

  print("Each person should pay: \$${eachPerson.toStringAsFixed(2)}");
}

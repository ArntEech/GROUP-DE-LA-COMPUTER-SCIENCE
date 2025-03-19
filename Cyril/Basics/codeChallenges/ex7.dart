import 'dart:io';

void main() {
  const int maxAge = 90;
  const int daysPerYear = 365;
  const int weeksPerYear = 52;
  const int monthsPerYear = 12;

  stdout.write("What is your current age? ");
  int currentAge = int.parse(stdin.readLineSync()!);

  int yearsLeft = maxAge - currentAge;
  int daysLeft = yearsLeft * daysPerYear;
  int weeksLeft = yearsLeft * weeksPerYear;
  int monthsLeft = yearsLeft * monthsPerYear;

  print(
    "You have $daysLeft days, $weeksLeft weeks, and $monthsLeft months left.",
  );
}

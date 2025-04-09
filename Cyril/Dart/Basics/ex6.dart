import 'dart:io';

void main() {
  stdout.write("Enter your height in m: ");
  double height = double.parse(stdin.readLineSync()!);

  stdout.write("Enter your weight in kg: ");
  double weight = double.parse(stdin.readLineSync()!);

  int bmi = (weight ~/ (height * height));
  print("Your Body Mass Index is: $bmi");
}

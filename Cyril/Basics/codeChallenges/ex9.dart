import 'dart:io';

void main() {
  stdout.write('Enter your weight (in kg): ');
  double weight = double.parse(stdin.readLineSync()!);

  stdout.write('Enter your height (in meters): ');
  double height = double.parse(stdin.readLineSync()!);

  // Calculate BMI
  double bmi = weight / (height * height);

  String category;
  if (bmi < 18.5) {
    category = 'Underweight';
  } else if (bmi >= 18.5 && bmi <= 24.9) {
    category = 'Normal weight';
  } else if (bmi >= 25 && bmi <= 29.9) {
    category = 'Overweight';
  } else if (bmi >= 30 && bmi <= 34.9) {
    category = 'Obese';
  } else {
    category = 'Clinically Obese';
  }

  print('Your BMI is ${bmi.toStringAsFixed(1)}, you are $category.');
}

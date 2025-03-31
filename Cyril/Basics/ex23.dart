import 'dart:io';

void main() {
  print("Enter a number to count digits: ");
  int digit = int.parse(stdin.readLineSync()!);
  print("The number $digit has ${countDigits(digit)} digits.");
}

int countDigits(int number) {
  return number.toString().length;
}

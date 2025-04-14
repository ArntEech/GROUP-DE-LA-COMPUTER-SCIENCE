import 'dart:io';

void main() {
  stdout.write("Enter a number:");
  int number = int.parse(stdin.readLineSync()!);
  checkEvenOrOdd(number);
}

void checkEvenOrOdd(int number) {
  if (number % 2 == 0) {
    print("Even Number");
  } else {
    print("Odd Number");
  }
}

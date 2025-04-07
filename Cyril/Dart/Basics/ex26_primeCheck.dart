import 'dart:io';

void primeChecker(int number) {
  if (number < 2) {
    print("$number is not a prime number.");
    return;
  }

  for (int i = 2; i * i <= number; i++) {
    if (number % i == 0) {
      print("$number is not a prime number.");
      return;
    }
  }

  print("$number is a prime number.");
}

void main() {
  stdout.write("Check this number: ");
  int n = int.parse(stdin.readLineSync()!);
  primeChecker(n);
}

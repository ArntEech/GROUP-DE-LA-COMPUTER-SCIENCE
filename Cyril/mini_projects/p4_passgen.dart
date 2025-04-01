import 'dart:io';
import 'dart:math';

void main() {
  print("--Welcome to the Password Generator--");

  print("How many letters would you like in your password?");
  int noOfLetters = int.parse(stdin.readLineSync()!);

  print("How many symbols would you like");
  int noOfSymbols = int.parse(stdin.readLineSync()!);

  print("How many numbers would you like");
  int noOfNumbers = int.parse(stdin.readLineSync()!);

  GeneratePassword(noOfLetters, noOfSymbols, noOfNumbers);
}

void GeneratePassword(int noOfLetters, int noOfSymbols, int noOfNumbers) {
  final letters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'.split(
    '',
  );
  final numbers = '0123456789'.split('');
  final symbols = '!#\$%&()*+'.split('');

  List<String> password = [];
  for (int i = 0; i < noOfLetters; i++) {
    password.add(letters[Random().nextInt(letters.length)]);
  }

  for (int i = 0; i < noOfSymbols; i++) {
    password.add(symbols[Random().nextInt(symbols.length)]);
  }

  for (int i = 0; i < noOfNumbers; i++) {
    password.add(numbers[Random().nextInt(numbers.length)]);
  }

  password.shuffle();
  String pass = password.join('');

  print(pass);
}

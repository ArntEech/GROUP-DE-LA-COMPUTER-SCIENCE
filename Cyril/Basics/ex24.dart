import 'dart:io';

void main() {
  stdout.write("Enter a word to reverse: ");
  String wordInput = stdin.readLineSync()!;
  print("Reversed word: ${reverseString(wordInput)}");
}

String reverseString(String input) {
  return input.split('').reversed.join('');
}

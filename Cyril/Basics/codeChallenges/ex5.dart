import 'dart:io';

void main() {
  stdout.write("Enter a two-digit number: ");
  var number = stdin.readLineSync()!;

  var no = number.split('');

  var a = int.parse(no[0]);
  var b = int.parse(no[1]);

  var sum = a + b;

  print("$a + $b = $sum");
}

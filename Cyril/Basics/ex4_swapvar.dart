import 'dart:io';

void main() {
  stdout.write("a: ");
  String? a = stdin.readLineSync();

  stdout.write("b: ");
  String? b = stdin.readLineSync();

  String? x;
  x = a;
  a = b;
  b = x;

  print("a: $a");
  print("b: $b");
}

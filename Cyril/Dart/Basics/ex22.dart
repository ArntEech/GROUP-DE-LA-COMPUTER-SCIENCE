import 'dart:io';

void main() {
  stdout.write("Enter a number for multiplication table: ");
  int n = int.parse(stdin.readLineSync()!);
  multiplicationTable(n);
}

void multiplicationTable(int n) {
  for (int i = 1; i <= 10; i++) {
    print("$n x $i = ${n * i}");
  }
}

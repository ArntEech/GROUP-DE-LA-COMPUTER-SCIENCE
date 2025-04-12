import 'dart:io';

void main() {
  stdout.write("Enter year: ");
  int year = int.parse(stdin.readLineSync()!);

  if (year < 0) {
    print("Invalid year. Please enter a valid year.");
    return;
  }

  stdout.write("Enter month (1-12): ");
  int month = int.parse(stdin.readLineSync()!);

  if (month < 1 || month > 12) {
    print("Invalid month. Please enter a number between 1 and 12.");
    return;
  }

  int days = daysInMonth(year, month);

  print("Number of days: ${days}");
}

bool isLeap(int year) {
  if (year % 4 == 0) {
    if (year % 100 == 0) {
      return year % 400 == 0;
    }
    return true;
  }
  return false;
}

int daysInMonth(int year, int month) {
  List<int> daysPerMonth = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

  if (month == 2 && isLeap(year)) {
    return 29;
  }
  return daysPerMonth[month - 1];
}

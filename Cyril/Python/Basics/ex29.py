def is_leap(year):
    if year % 4 == 0:
        if year % 100 == 0:
            return year % 400 == 0
        return True
    return False


def days_in_month(year, month):
    days_per_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    if month == 2 and is_leap(year):
        return 29
    return days_per_month[month - 1]


year = int(input("Enter year: "))
if year < 0:
    print("Invalid year. Please enter a valid year.")
else:
    month = int(input("Enter month (1-12): "))
    if month < 1 or month > 12:
        print("Invalid month. Please enter a number between 1 and 12.")
    else:
        days = days_in_month(year, month)
        print(f"Number of days: {days}")
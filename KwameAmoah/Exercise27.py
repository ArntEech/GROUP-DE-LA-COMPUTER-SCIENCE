# Sample dataset (🚨 DO NOT modify)
travel_log = [
    {
        "country": "France",
        "visits": 12,
        "cities": ["Paris", "Lille", "Dijon"]
    },
    {
        "country": "Germany",
        "visits": 5,
        "cities": ["Berlin", "Hamburg", "Stuttgart"]
    },
]
# 🚨 Do NOT change the code above 👆

# 📝 TODO-1: Write a function that allows new countries
# to be added to the travel_log. 👇
def add_new_country(country, times, cities):
    new_entry = {
        "country": country,
        "visits" : times,
        "cities" : cities
    }

    travel_log.append(new_entry)



# 🚨 Do not change the code below 👇
add_new_country("Russia", 2, ["Moscow", "Saint Petersburg"])
print(travel_log)
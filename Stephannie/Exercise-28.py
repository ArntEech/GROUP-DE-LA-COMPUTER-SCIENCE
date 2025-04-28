#Dictionary in a list

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

def add_country(country, num_of_visits, cities_travelled):
    travel = {
        "country" : country,
        "visits" : num_of_visits,
        "cities" : cities_travelled
    }
    print(f"You have visited {country} {num_of_visits} times.\n You have been to {cities_travelled[0]} and {cities_travelled[1]}")

    travel_log.append(travel)

add_country("Canada", 3, ["Ontario", "Montreal"])

print(travel_log)
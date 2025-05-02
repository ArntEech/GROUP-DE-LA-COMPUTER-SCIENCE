/*| Module Name      | Description                                                                 |
|------------------|-----------------------------------------------------------------------------|
| `coffee_maker`   | Handles resources and brewing logic                                         |
| `menu`           | Contains the available drink options and their ingredients/cost            |
| `money_machine`  | Handles coin processing and transactions                                    | */

class menuItem {
    constructor(name,cost,coffee,milk,water){
        this.name = name;
        this.cost = cost;
        this.ingredients = {water,milk,coffee};
    }
}
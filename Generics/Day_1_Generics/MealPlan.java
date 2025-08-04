package Day_1_Generics;

interface MealPlan {
    void showMeal();
}

class VegetarianMeal implements MealPlan {
    public void showMeal() { System.out.println("Vegetarian meal plan"); }
}

class VeganMeal implements MealPlan {
    public void showMeal() { System.out.println("Vegan meal plan"); }
}

class KetoMeal implements MealPlan {
    public void showMeal() { System.out.println("Keto meal plan"); }
}

class Meal<T extends MealPlan> {
    T plan;
    public Meal(T plan) {
        this.plan = plan;
    }

    public void showPlan() {
        plan.showMeal();
    }

    public static <T extends MealPlan> boolean validateMealPlan(T plan) {
        System.out.print("Validating... ");
        plan.showMeal();
        return true;
    }
}


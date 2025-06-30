package TasksOOPS.InheritOOPS;

public class Pasta extends Recipe {
public void getIngredients() {
	System.out.println("---------Ingredients for Pasta---------");
	System.out.println("200g (2 cups) pasta (penne, spaghetti, or your choice)\n"
			+ "\n"
			+ "2 tbsp olive oil or butter\n"
			+ "\n"
			+ "4–5 garlic cloves (finely chopped or minced)\n"
			+ "\n"
			+ "1 small onion (finely chopped) – optional\n"
			+ "\n"
			+ "1/2 tsp chili flakes – optional\n"
			+ "\n"
			+ "1 cup milk or cream\n"
			+ "\n"
			+ "1/2 cup grated cheese (mozzarella/cheddar/parmesan)\n"
			+ "\n"
			+ "Salt to taste\n"
			+ "\n"
			+ "Black pepper to taste\n"
			+ "\n"
			+ "Fresh herbs (like basil or parsley) – optional");
}
public void getInstruction() {
	System.out.println("---------Instruction for Pasta---------");
	System.out.println("Boil Pasta:\n"
			+ "\n"
			+ "* Bring a pot of water to a boil. Add a pinch of salt.\n"
			+ "\n"
			+ "* Add pasta and cook as per package instructions (usually 8–10 minutes).\n"
			+ "\n"
			+ "* Drain and keep aside. Reserve 1/4 cup of pasta water (optional)");
	System.out.println("Prepare the sauce:\n"
			+ "\n"
			+"Heat olive oil or butter in a pan on medium heat.\n"
			+ "\n"
			+ "* Add chopped garlic (and onion if using) and sauté until fragrant and slightly golden.\n"
			+ "\n"
			+ "* Add chili flakes (optional) and stir");
	System.out.println("Garnish & Serve:\n"
			+ "\n"
			+ "Sprinkle chopped herbs and extra cheese if desired.\n"
			+ "\n"
			+ "Serve hot with garlic bread or salad!\n");
}
}

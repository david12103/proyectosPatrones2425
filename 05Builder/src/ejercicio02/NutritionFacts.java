package ejercicio02;

public class NutritionFacts {
    // Required fields
    private final int servingSize;
    private final int servings;
    
    // Optional fields - initialized to default values
    private final int calories;
    private final int fat;

<<<<<<< Updated upstream
	// obligatorias
	private  int servingSize;
	private  int servings;
	// opcionales
	private  int calories;
	private  int fat;

	private NutritionFacts(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
	}
	
	public static class Builder{
		private  int servingSize;
		private  int servings;
		// opcionales
		private  int calories=0;
		private  int fat=0;
		
		private Builder(int servingSize, int servings) {
			super();
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public static Builder builder(int servingSize, int servings) {
			return new Builder(servingSize, servings); 
		}
		
		public Builder calories(int calories) {
			this.calories=calories;
			return this;
		}
		public Builder fat(int fat) {
			this.fat=fat;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

	}

	public int getServingSize() {
		return servingSize;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	
=======
    // Private constructor so only the builder can access it
    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
    }

    // Static nested Builder class
    public static class Builder {
        // Required fields
        private int servingSize;
        private int servings;
        
        // Optional fields - initialized to default values
        private int calories = 0;
        private int fat = 0;

        // Constructor for required fields
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        // Setter for optional field calories
        public Builder calories(int calories) {
            this.calories = calories;
            return this; // returns the builder itself for chaining
        }

        // Setter for optional field fat
        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        // Build method to create an instance of NutritionFacts
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    // Getters for the fields
    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    // Override toString for easier display of the object’s data
    @Override
    public String toString() {
        return "NutritionFacts [servingSize=" + servingSize +
               ", servings=" + servings +
               ", calories=" + calories +
               ", fat=" + fat + "]";
    }
>>>>>>> Stashed changes
}

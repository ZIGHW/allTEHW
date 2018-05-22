package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /*
        INSTRUCTIONS

        The primary purposes of these exercises are to practice: 
        		
        		1. declaring variables and using assignment statements
        		2. using variables, literals, and operators within arithmetic expressions
        		3. choosing meaningful variable names
        		4. choosing appropriate data types

        One of the hardest things about programming is choosing good names. Spend time
        to find good, meaningful, and descriptive names for your variables. Clarity and
        expressiveness is more important than brevity. Err on the side of longer, more 
        descriptive names over short, cryptic ones.

        Be consistent with your choice of datatypes, especially when it comes to 
        some values like money. There are many different ways to express money. Pick one, 
        and stick with it throughout these exercises.
        
        Keep your code consistent and well formatted. When code is poorly indented, 
        or lost in a flood of blank lines, it can make code difficult to read. 
        */

        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		
		// ### EXAMPLE:  
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		
		// ### EXAMPLE: 
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		int numRacoons = 3;
		int leavingRacoons = 2;
		int remainingRacoons = numRacoons - leavingRacoons; 
		/*
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int flowers = 5;
		int bees = 3;
		int flowersVsBees = flowers - bees;
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		int pigeon = 1;
		int anotherPigeon = 1;
		int totalPigeons = 1;
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		int owls = 3;
		int moreOwls = 2;
		int totalOwls = owls + moreOwls;
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		int beavers = 2;
		int swimmingBeavers = 1;
		int beaversWorking = beavers - swimmingBeavers;
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
		int toucans = 2;
		int moreToucans = 1;
		int totalToucans = toucans + moreToucans;
		

        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		int squirrels = 4;
		int nuts = 2;
		int squirrelsVsNuts = squirrels - nuts;
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		int quarterMoney = 25;
		int dimeMoney = 10;
		int nickelMoney = 2 * 5;
		int totalCashMoney = quarterMoney + nickelMoney + dimeMoney;
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		int brierMuffins = 18;
		int macadamsMuffins = 20;
		int flanMuffins = 17;
		int totalMuffins = brierMuffins + macadamsMuffins + flanMuffins;
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int whistleCost = 14;
		int yoyoCost = 24;
		int totalCost = whistleCost + yoyoCost;
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int largeMarsh = 8;
        int smallMarsh = 10;
        int totalMarsh = largeMarsh + smallMarsh;
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int hiltSnow = 29;
        int brecknockSnow = 17;
        int hiltSnowVsBrecknockSnow = hiltSnow - brecknockSnow;
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int hiltCash = 10;
        int truckCost = 2;
        int pencilCost = 2;
        int moneyLeft = hiltCash - truckCost - pencilCost;
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int marblesStart = 16;
        int marblesLost = 7;
        int marblesNow = marblesStart - marblesLost;
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int megShells = 19;
        int desiredShells = 25;
        int neededShells = desiredShells - megShells;
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int bradTotal = 17;
        int bradRed = 8;
        int bradGreen = bradTotal - bradRed;
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksStart = 38;
        int booksAdded = 10;
        int booksTotal = booksStart + booksAdded;
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int beeLegs = 6;
        int beesnum = 8;
        int beeLegsTotal = beeLegs * bees;
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        int creamCost = 99;
        int numOfCreams = 2;
        int costOfCreams = creamCost * numOfCreams;
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int totalRocksNeeded = 125;
        int rocksHad = 64;
        int rocksToGet = totalRocksNeeded - rocksHad;
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int startMarbles = 38;
        int lostMarbles = 15;
        int leftMarbles = startMarbles - lostMarbles;
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int distanceTotal = 78;
        int distanceTraveled = 32;
        int distanceLeft = distanceTotal - distanceTraveled;
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int snowMorn = 90;
        int snowNoon = 45;
        int totalSnow = snowMorn + snowNoon;
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int dogNum = 6;
        double dogCost = 0.50;
        double totalDogCost = dogCost * dogNum;
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int cents = 50;
        int difPencilCost = 7;
        int pencilsYouCanBuy = 50 / 7;
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int totalButt = 33;
        int orangeButt = 20;
        int redButt = totalButt - orangeButt;
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        int paid = 1;
        double cost = .54;
        double change = paid - cost;
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int treesStart = 13;
        int treesPlanted = 12;
        int treesTotal = treesStart + treesPlanted;
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int hoursInDay = 24;
        int numDays = 2;
        int hoursTillGMaw = hoursInDay * numDays;
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int cousins = 4;
        int gumPerCousin = 5;
        int gumTotal = cousins * gumPerCousin;
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        int danMoney = 3;
        int candyCost = 1;
        int danMoneyLeft = danMoney - candyCost;
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int boats = 5;
        int peoplePerBoat = 3;
        int totalPeople = boats * peoplePerBoat;
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int startingLegos = 380;
        int lostLegos = 57;
        int nowLegos = startingLegos - lostLegos;
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int artMufs = 35;
        int artMufsDesired = 83;
        int artMufsToBake = artMufsDesired - artMufs;
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyCrayons = 1400;
        int lucyCrayons = 290;
        int willyCrayonsVsLucyCrayons = willyCrayons - lucyCrayons;
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickPerPage = 10;
        int numPages = 22;
        int totalSticks = stickPerPage * numPages;
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int cupcakes = 96;
        int kiddos = 8;
        int cupcakePerKiddo = cupcakes / kiddos;
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int cookies = 47;
        int cookiesPerJar = 6;
        int cookiesNotInJar = cookies % cookiesPerJar;
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int bread = 59;
        int friends = 8;
        int breadNotGivenToFriends = bread % friends;
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int cookiePerTray = 12;
        int totalCookiesDesired = 276;
        int numTraysToBake = totalCookiesDesired / cookiePerTray;
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int pretzelNum = 480;
        int oneServing = 12;
        int servingsNum = pretzelNum / oneServing;
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int lemonCakeNum = 53;
        int lemonCakeLeft = 2;
        int lemonCakesPerBox = 3;
        int lemonCakeBoxesGiven = (lemonCakeNum - lemonCakeLeft) / lemonCakesPerBox;
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrotSticksNum = 74;
        int people = 12;
        int carrotSticksPerPerson = carrotSticksNum % people;
        //But actually unknown because whether or not the people ate their carrot sticks is not given.
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int teddyBears = 98;
        int teddyBearsPerShelf = 7;
        int numShelves = teddyBears / teddyBearsPerShelf;
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int picsPerAlbum = 20;
        int picsTotal = 480;
        int albumsTotal = picsTotal / picsPerAlbum;
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int cards = 94;
        int cardsPerBox = 8;
        int boxesUsed = cards / cardsPerBox;
        int cardsLeft = cards % cardsPerBox;
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int books = 210;
        int shelves = 10;
        int booksPerShelf = books / shelves;
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int breads = 17;
        int guests = 7;
        int breadPerGuest = breads / guests;
        /*
            CHALLENGE PROBLEMS
        */
        
        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages 
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
        double billSpeed = 1/(2.15);
        double jillSpeed = 1/(1.90);
        double totalSpeed = billSpeed + jillSpeed;
        int rooms = 5;
        double timeToPaintFive = rooms / totalSpeed;
        int moreRooms = 623;
        int hoursPerDay = 8;
        double daysToPaint = Math.ceil( 623/ (totalSpeed * 8) );
        
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle inital must end
        with a period.
        Example: "Hopper, Grace B." 
        */
        String fName = "Zach";
        String lName = "Groves";
        String mInitial = "I";
        String fullName = lName + ", " + fName + " " + mInitial + ".";
        /*
        The distance between New York and Chicago is 800 miles, and the train has already traveled 537 miles. 
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already traveled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
        double distance = 800;
        double traveled = 537;
        double percentTraveled = (traveled / distance) * 100;
        System.out.println("percent Traveled: " + percentTraveled);
        int percentTraveledInt = (int) percentTraveled;            
	}

}

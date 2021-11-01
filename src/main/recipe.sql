##Ingredient
INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Skinka');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Ris');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Vitlök');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Dijonsenap');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Smör');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Salt');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Svartpeppar');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Grönsaksbuljong');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Vetemjöl');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Vatten');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Lök');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Bacon');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Vispgrädde');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Purjolök');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Ägg');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Ost');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Vitkål');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Köttfärs');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Potatis');

INSERT INTO g37_jpa_assignment.ingredient (ingredient_name)
VALUES ('Vitpeppar');


#Instruction
INSERT INTO g37_jpa_assignment.recipe_instruction (instruction_id, instructions)
VALUES ('1001',
        '1. Skär skinkan i smala strimlor. 2. Bryn köttet i några omgångar i smör i en stekpanna. Salta och peppra. 3.Blanda buljongtärning, vispgrädde och vitlök i en låg och vid panna. 4. Koka ihop någon minut. Tillsätt senap. Lägg ner köttet i såsen. 5. Låt koka på svag värme ca 15 minuter. Servera med ris, kokt potatis eller kokt pasta och en god grönsallad.');

INSERT INTO g37_jpa_assignment.recipe_instruction (instruction_id, instructions)
VALUES ('1002',
        '1. Blanda snabbt samman smör, salt, mjöl och vatten. Lägg degen i plastfilm. Låt ligga i kylen i minst 1 timme. 2. Hacka löken och strimla baconet. Fräs baconet 1 minut utan att det tar färg. Tillsätt löken. Fräs i ytterligare 1 minut. 3. Häll på grädden och koka i 10 - 15 minuter, till en krämig konsistens. 4. Strimla purjon och låt den koka med ett par minuter. 5. Sätt ugnen på 200°. 6. Låt degen ligga framme ett tag. Kavla ut degen. Rulla upp degen på en rulle, då håller den bättre. 7. Börja vid kanten och rulla ut degen över formen, ca 25 cm i diameter, som bör ha löstagbar botten. 8. Tryck ut degen i kanterna, det är praktiskt att använda en degbit. Förgrädda pajskalet i 5-7 minuter. 9. Blanda ner äggen i fyllningen. Häll den i pajskalet. Strö över osten. 10. Grädda längst ner i ugnen i ca 5 minuter. 11. Kavla ut och skär den överblivna degen i remsor. Lägg på. Pensla ev med lite äggula för att få fin färg på pajen. 12. Grädda i ytterligare 15-20 minuter. Servera gärna med en frasig grönsallad och varför inte ett glas välkylt rosévin.');

INSERT INTO g37_jpa_assignment.recipe_instruction (instruction_id, instructions)
VALUES ('1003',
        'Skär vitkålen i strimlor, skala potatisen och skär den i skivor. Blanda köttfärsen med kryddor och 4 msk vatten. Lägg vitkålen i grytan och varva med köttfärs och potatis. Häll över 5 dl vatten. Låt grytan koka sakta ca 1,5 timme. Servera med lingonsylt.');


#Recipe
INSERT INTO g37_jpa_assignment.recipe (recipe_name, instruction_id)
VALUES ('Bondens bästa gryta', '1001');

INSERT INTO g37_jpa_assignment.recipe (recipe_name, instruction_id)
VALUES ('Stefans lök & baconpaj', '1002');

INSERT INTO g37_jpa_assignment.recipe (recipe_name, instruction_id)
VALUES ('Vitkålsgryta med köttfärs', '1003');


#Recipe Ingredient
INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('101', 1.5, null, 1, 1);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('102', 4, null, 2, 1);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('103', 4, null, 3, 1);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('104', 3, null, 4, 1);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('105', 0.5, null, 6, 1);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('106', 1, null, 7, 1);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('107', 1, null, 8, 1);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('108', 3, null, 13, 1);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('109', 100, null, 5, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('110', 0.5, null, 6, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('111', 2.5, null, 9, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('112', 3, null, 10, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('113', 2, null, 11, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('114', 140, null, 12, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('115', 3, null, 13, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('116', 0.5, null, 14, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('117', 2, null, 15, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('118', 50, null, 16, 2);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('119', 1, null, 17, 3);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('120', 3, null, 18, 3);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('121', 10, null, 19, 3);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('122', 0, null, 6, 3);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('123', 0, null, 7, 3);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('124', 0, null, 20, 3);

INSERT INTO g37_jpa_assignment.recipe_ingredient (recipe_ingredient_id, amount, measurement, ingredient_id, recipe_id)
VALUES ('125', 0, null, 10, 3);


#Category
INSERT INTO g37_jpa_assignment.recipe_category (category)
VALUES ('Kött');

INSERT INTO g37_jpa_assignment.recipe_category (category)
VALUES ('Gryn');

INSERT INTO g37_jpa_assignment.recipe_category (category)
VALUES ('Grönsaker');

INSERT INTO g37_jpa_assignment.recipe_category (category)
VALUES ('Fisk');

INSERT INTO g37_jpa_assignment.recipe_category (category)
VALUES ('Fågel');

INSERT INTO g37_jpa_assignment.recipe_category (category)
VALUES ('Pasta');

INSERT INTO g37_jpa_assignment.recipe_category (category_id, category)
VALUES (7, 'Mejeriprodukter');

INSERT INTO g37_jpa_assignment.recipe_category (category_id, category)
VALUES (8, 'Kryddor, örter mm');

INSERT INTO g37_jpa_assignment.recipe_category (category_id, category)
VALUES (9, 'Ägg');

INSERT INTO g37_jpa_assignment.recipe_category (category_id, category)
VALUES (10, 'Mjöl');

INSERT INTO g37_jpa_assignment.recipe_category (category_id, category)
VALUES (11, 'Rotfrukter');


#JoinTable Category <-> Recipe
INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (1, 1);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (2, 1);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (3, 1);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (7, 1);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (8, 1);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (1, 2);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (3, 2);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (7, 2);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (8, 2);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (9, 2);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (10, 2);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (1, 3);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (3, 3);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (8, 3);

INSERT INTO g37_jpa_assignment.recipe_recipe_category (recipe_category_id, recipe_id)
VALUES (11, 3);


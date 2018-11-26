ApartmentBuilding FRQ

To answer:
An ApartmentBuilding is different from a regular building because instead of keeping track 
of the watt hours used for the whole building, it needs to keep track of the watt hours used 
by each of the individual apartments in the building.

Write a complete declaration of class ApartmentBuilding including the following:
A private field (an array) to be used to store the apartments’ watt hours.
A constructor with two parameters: the address of the apartment building and the number of 
apartments.  The constructor should initialize the building’s address field as well as 
initializing the array to be big enough to store watt hours for each apartment in the building.
An implementation of amtOwed that returns the amount of money owed by the entire building 
for the electricity used (calculated by multiplying the sum of the wattHours for the entire 
building by the RATE).
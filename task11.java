import java.util.*;
class task11
{
    void main()
    {
        Scanner a=new Scanner(System.in);
        int play,c,ans,marks=0;
        System.out.println("Welcome!!! To my Quiz");
        System.out.println("The best place to test your knowledge");
        System.out.println("Enter 1 to play or 2 to exit");
        play=a.nextInt();
        if(play!=1)
        {
            System.out.println("Invalid Choice!! :(");
            System.exit(0);
        }
        else
        {
            System.out.println("");
            System.out.println("Select the category of questions you want to answer");
            System.out.println("Enter the corresponding number");
            System.out.println("1. Biology");
            System.out.println("2. English");
            System.out.println("3. Religion");
            System.out.println("4. Mathematics");
            
            c=a.nextInt();
            switch(c)
            {
                case 1:
                {
                    System.out.println("");
                    System.out.println("You opted to answer for Biology");
                    System.out.println("Let's get started");
                    System.out.println("");
                    System.out.println("1. Ribosomes were discovered by?");
                    System.out.println("1. Scleiden    2. Schwann");
                    System.out.println("3. Palade      4. Whitekar");

                    ans=a.nextInt();
                    if(ans!=3)
                    {
                        System.out.println("Your answer is wrong...the correct answer is option 3");
                        System.out.println("Your marks are  "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("2. The door swells in rainy season due to which phenomenon?");
                    System.out.println("1. Osmosis          2. Diffusion ");
                    System.out.println("3. Transpiration    4. Imbibition");

                    ans=a.nextInt();
                    if(ans!=4)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 4");
                        System.out.println("Your marks are "+marks);
                    } 
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("3. The full form of PCR is?");
                    System.out.println("1. Polymerase Chain Reaction    2. Polynucleotide Chain Reaction ");
                    System.out.println("3. Phosphorus Carbon Reaction   4. Polyvinyl Castor Reactivity");

                    ans=a.nextInt();
                    if(ans!=1)
                    {
                        System.out.println("Your answer is wrong...the correct answer is option 1");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("4.Arthropods and Annelids have what in common?");
                    System.out.println("1. Skull    2. Ventral Nerve Cord");
                    System.out.println("3. Brain    4. Backbone");
                    
                    ans=a.nextInt();
                    if(ans!=2)
                    {
                        System.out.println("Your answer is wrong...the correct answer is option 2");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("5.How many ribs do humans have?");
                    System.out.println("1. 13    2. 7");
                    System.out.println("3. 12    4. 10");
                    
                    ans=a.nextInt();
                    if(ans!=3)
                    {
                        System.out.println("Your answer is wrong...the correct answer is option 3");
                        System.out.println("Your marks are "+marks+" Out of 50");
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks+" Out of 50");

                    }
                }
                break;

                case 2:
                {
                    System.out.println("");
                    System.out.println("You opted to answer for English");
                    System.out.println("Let's get started");
                    System.out.println("");
                    System.out.println("1. What is synonym of front?");
                    System.out.println("1. Forward    2. Backward");
                    System.out.println("3. Sideway    4. Ahead of");

                    ans=a.nextInt();
                    if(ans!=4)
                    {
                        System.out.println("Your answer is wrong...the correct answer is option 4");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well Played");
                        System.out.println("Your marks are "+marks);

                    }
                    System.out.println("");
                    System.out.println("2. What does optimistic means?");
                    System.out.println("1. Who believes in God    2. Who donot believe in God");
                    System.out.println("3. Who thinks positive    4. Who thinks negative");

                    ans=a.nextInt();
                    if(ans!=3)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 3");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("3. She had only _____ toffees?");
                    System.out.println("1. a little      2. a few");
                    System.out.println("3. the little    4. the few");

                    ans=a.nextInt();
                    if(ans!=2)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 1");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well Played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("4. Who is the author of our national anthem?");
                    System.out.println("1. Ruskin Bond    2. Rabindrnath Tagore");
                    System.out.println("3. K.V. Rao       4. Chetan Bhagat");

                    ans=a.nextInt();
                    if(ans!=2)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 2");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well Played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("5. Which of following is an Indian author?");
                    System.out.println("1. Ruskin Bond        2. John Green");
                    System.out.println("3. Nicholas Sparks    4. Chetan Bhagat");

                    ans=a.nextInt();
                    if(ans!=4)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 4");
                        System.out.println("Your marks are "+marks+" Out of 50");
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well Played");
                        System.out.println("Your marks are "+marks+" Out of 50");
                    }
                }

                break;
                case 3:
                {
                    System.out.println("");
                    System.out.println("You opted to answer for Religion");
                    System.out.println("Let's get started");
                    System.out.println("");
                    System.out.println("1. Which of following is a religion?");
                    System.out.println("1. Budhism     2. All of above");
                    System.out.println("3. Hinduism    4. Jainism");

                    ans=a.nextInt();
                    if(ans!=2)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 2");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    } 
                    System.out.println("");
                    System.out.println("2. What does religion teaches us?");
                    System.out.println("1. God is one       2. God is two");
                    System.out.println("3. God donot exist  4. None should worship Gods");

                    ans=a.nextInt();
                    if(ans!=1)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 1");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("3. Budhism was taught by?");
                    System.out.println("1. Lord Krishna      2. Jain Guru");
                    System.out.println("3. Guru Nanak Dev    4. Gautum Budh");

                    ans=a.nextInt();
                    if(ans!=4)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 4");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("4. The sacred book of Hindus is?");
                    System.out.println("1. Bible      2. Quran");
                    System.out.println("3. Ramayan    4. Granth Sahib");

                    ans=a.nextInt();
                    if(ans!=3)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 3");
                        System.out.println("Your marks are "+marks);
                    } 
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("5. Lord Jesus was a ______ guru.");
                    System.out.println("1. Christian    2. Hindu");
                    System.out.println("3. Jain         4. Sikh");

                    ans=a.nextInt();
                    if(ans!=1)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 1");
                        System.out.println("Your marks are "+marks+" Out of 50");
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks+" Out of 50");
                    }
                }

                break;

                case 4:
                {
                    System.out.println("");
                    System.out.println("You opted to answer for Mathematics");
                    System.out.println("Let's get started");
                    System.out.println("");
                    System.out.println( "1. 2+2 is equal to?");
                    System.out.println( "1. 4    2. 6");
                    System.out.println( "3. 3    4. 8");

                    ans=a.nextInt();
                    if(ans!=1)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 2");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("2. 20*20 is equal to");
                    System.out.println("1. 40    2. 400");
                    System.out.println("3. 80    4. 800");

                    ans=a.nextInt();
                    if(ans!=2)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 2");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("3. 40%10 leaves remainder of?");
                    System.out.println("1. 4    2. 1");
                    System.out.println("3. 3    4. 0");

                    ans=a.nextInt();
                    if(ans!=4)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 4");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("4. The answer of {2(3+45*2)}");
                    System.out.println("1.180    2. 192");
                    System.out.println("3.186    4. 200");

                    ans=a.nextInt();
                    if(ans!=3)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 3");
                        System.out.println("Your marks are "+marks);
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks);
                    }
                    System.out.println("");
                    System.out.println("5. The formula to calculate interest is?");
                    System.out.println("1. 100*R*T/P    2. 100*P*R/T");
                    System.out.println("3. P*R*T/100    4. 100*P*T/R");

                    ans=a.nextInt();
                    if(ans!=3)
                    {
                        System.out.println("Your answer is wrong...The correct answer is option 3");
                        System.out.println("Your marks are "+marks+" Out of 50");
                    }
                    else
                    {
                        marks=marks+10;
                        System.out.println("Your answer is correct");
                        System.out.println("Well played");
                        System.out.println("Your marks are "+marks+" Out of 50");
                    }
                }

                break;
                default:

                System.out.println("Invalid choice...exiting :(");
                System.exit(0);
            }
            System.out.println("");
            System.out.println("The quiz ends");
            System.out.println("Hope you enjoyed");
            System.out.println("Thanks for playing :)");
        }
    }
}
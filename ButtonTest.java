/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buttontest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;


/**
 *
 * @author matt rawson
 * 5/7/14
 */
public class ButtonTest extends JFrame
    {

        
        private static final int windowWidth = 400;
        private static final int windowHeight = 400;
        
        /* playersNumber and computerNumber hold a number that goes with each
        specific choice they are then used for comparison to see who won.*/ 
        
        private int playersNumber = 0;
        private int computerNumber = 0;
        
        /* The rock,paper,and scissorListeners are called depending on the 
        what the player chose. They set playersNumber to the correct number 
        for comparison later.*/
        
        public class RockListener implements ActionListener
            {

            @Override public void actionPerformed( ActionEvent event )
                {
                
                System.out.println("You chose Rock");
                
                playersNumber = 1;
                
                computerChoice();
                    
                }// @Override public void actionPerformed( ActionEvent event )

            }// public class ClickListener implements ActionListener
        
        public class PaperListener implements ActionListener
            {

            @Override public void actionPerformed( ActionEvent event )
                {
                
                System.out.println("You Chose Paper");
                
                playersNumber = 2;
                
                computerChoice();
                    
                }// @Override public void actionPerformed( ActionEvent event )
            
            }// public class PaperListener implements ActionListener
        
        public class ScissorListener implements ActionListener
            {

            @Override public void actionPerformed( ActionEvent event )
                {
                
                System.out.println("You Chose Scissor");
                
                playersNumber = 3;
                
                computerChoice();
                    
                }// @Override public void actionPerformed( ActionEvent event )
            
            }// public class ScissorListener implements ActionListener
        
        
        public ButtonTest()
            {
            
            windowBuild();
            
            setSize( windowWidth, windowHeight );
                
            }// public ButtonTest()
        
        // The window is build here in the function windowBuild()
        
        private void windowBuild()
            {
               
            JButton rock = new JButton("Rock");
            
            JButton paper = new JButton("Paper");
            
            JButton scissor = new JButton("Scissor");
            
            JPanel choice = new JPanel();
            
            choice.add(rock);
            
            choice.add(paper);
            
            choice.add(scissor);
            
            add(choice);

            ActionListener rockOutputed = new RockListener();
            
            ActionListener paperOutputed = new PaperListener();
            
            ActionListener scissorOutputed = new ScissorListener();
            
            rock.addActionListener(rockOutputed);
            
            paper.addActionListener(paperOutputed);
            
            scissor.addActionListener(scissorOutputed);
            
            }// private void windowBuild()
        
        /* In computerChoice() the computer will randomly generate a number
        0 and 3. If the number is zero, it will keep randomizing. Then it 
        outputs what the computer chose*/
        
            public void computerChoice()
                {
                    
                while( computerNumber == 0 )
                    {

                    Random randomComputerChoice = new Random();
                
                    computerNumber = randomComputerChoice.nextInt(4);
                        
                    }// while( computerNumber == 0 )
                    
                if( computerNumber == 1 )
                    {
                     
                    System.out.println("The computer chose rock ");
                        
                    }// if( playersNumber == computerNumber )
                else if( computerNumber == 2 )
                    {
                     
                    System.out.println("The computer chose paper");
                        
                    }// if( playersNumber == computerNumber )
                
                else if( computerNumber == 3 )
                    {
                     
                    System.out.println("The computer chose scissor");
                        
                    }// if( playersNumber == computerNumber )
       
                determineWinner();
                    
                }// public void computerChoice()
            
            /* In determineWinner() the statements check to see who won.
            The first three statements check to see if the player won. The next
            three check to see if the player lost, and the last checks if it is 
            a tie.*/
            
            public void determineWinner()
                {

                if( playersNumber == 1 && computerNumber == 3 )
                    {
                    
                    System.out.println("You win");
                        
                    }// if( playersNumber == 1 && computerNumber == 3 )
                
                else if( playersNumber == 2 && computerNumber == 1 )
                    {
                    
                    System.out.println("You win");
                        
                    }// else if( playersNumber == 2 && computerNumber == 1 )
                
                else if( playersNumber == 3 && computerNumber == 2 )
                    {
                    
                    System.out.println("You win");
                        
                    }// else if( playersNumber == 3 && computerNumber == 2 )
                
                else if( playersNumber == 3 && computerNumber == 1 )
                    {
                    
                    System.out.println("You Lose");
                        
                    }// else if( playersNumber == 3 && computerNumber == 1 )
                
                else if( playersNumber == 1 && computerNumber == 2 )
                    {
                    
                    System.out.println("You Lose");
                        
                    }// else if( playersNumber == 1 && computerNumber == 2 )
                
                else if( playersNumber == 2 && computerNumber == 3 )
                    {
                    
                    System.out.println("You Lose");
                        
                    }// else if( playersNumber == 2 && computerNumber == 3 )
                
                else
                    {
                    
                    System.out.println("You and the compuer tied.");
                        
                    }// else of if( playersNumber == 1 && computerNumber == 3 )
                
                computerNumber = 0;
                
                playersNumber = 0;

                }// public void determineWinner()

    }// public class ButtonTest extends JFrame



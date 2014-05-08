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
 * @author rawsonmb
 */
public class ButtonTest extends JFrame
    {

        
        private static final int windowWidth = 400;
        private static final int windowHeight = 400;
        private int playersNumber = 0;
        private int computerNumber = 0;
        
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
            
            public void determineWinner()
                {

                if( playersNumber == 1 && computerNumber == 3 )
                    {
                    
                    System.out.println("You win");
                        
                    }// if( playersNumber == 1 && computerNumber == 3 )
                
                else if( playersNumber == 2 && computerNumber == 1 )
                    {
                    
                    System.out.println("You win");
                        
                    }// if( playersNumber == 2 && computerNumber == 1 )
                
                else if( playersNumber == 3 && computerNumber == 2 )
                    {
                    
                    System.out.println("You win");
                        
                    }// if( playersNumber == 3 && computerNumber == 2 )
                
                else if( playersNumber == 3 && computerNumber == 1 )
                    {
                    
                    System.out.println("You Lose");
                        
                    }// if( playersNumber == 3 && computerNumber == 1 )
                
                else if( playersNumber == 1 && computerNumber == 2 )
                    {
                    
                    System.out.println("You Lose");
                        
                    }// if( playersNumber == 1 && computerNumber == 2 )
                
                else if( playersNumber == 2 && computerNumber == 3 )
                    {
                    
                    System.out.println("You Lose");
                        
                    }// if( playersNumber == 2 && computerNumber == 3 )
                
                else
                    {
                    
                    System.out.println("You and the compuer tied.");
                        
                    }
                
                computerNumber = 0;
                
                playersNumber = 0;

                }// public void determineWinner()

    }// public class ButtonTest extends JFrame





package com.mycompany.executionsteps;

import java.util.Scanner;

class Bus {
    private int totalSeats;
    private boolean[] seats;

    public Bus(int totalSeats) {
        this.totalSeats = totalSeats;
        seats = new boolean[totalSeats];
        for (int i = 0; i < totalSeats; i++) {
            seats[i] = false; // Initially, all seats are unbooked (false)
        }
    }

    public void displayAvailableSeats() {
        System.out.println("Available Seats:");
        for (int i = 0; i < totalSeats; i++) {
            if (!seats[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }

    public void bookSeat(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= totalSeats) {
            if (!seats[seatNumber - 1]) {
                seats[seatNumber - 1] = true;
                System.out.println("Seat " + seatNumber + " booked successfully.");
            } else {
                System.out.println("Seat " + seatNumber + " is already booked. Please choose another seat.");
            }
        } else {
            System.out.println("Invalid seat number. Please enter a valid seat number.");
        }
    }
}

public class BusBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bus with 10 seats
        Bus bus = new Bus(10);

        int choice;

        do {
            System.out.println("\n1. Display Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bus.displayAvailableSeats();
                    break;
                case 2:
                    System.out.print("Enter the seat number you want to book: ");
                    int seatNumber = scanner.nextInt();
                    bus.bookSeat(seatNumber);
                    break;
                case 3:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 3);

        scanner.close();
    }
}

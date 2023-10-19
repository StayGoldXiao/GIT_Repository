L, D, W, M, Y = 1, 1, 4, 1, 2000
while (not (Y == 2000 and M == 1 and D == 1)):
    if M == 2 and D == 28 and Y % 4 == 0:
        M += 1;
    elif M == 2 and D == 29:
        M += 1;
    elif M == 1 or M == 3 or M == 5 or M == 7 or M == 8 or M == 10:
        if D == 31 and W == 7:
            L -= 2;
        if D == 31:
            M += 1;
            D = 1;
            L += 2;
        if W == 1:
            W = 1;
            L += 2;
    elif M == 4 or M == 6 or M == 9 or M == 11:
        if D == 30 and W == 7:
            L -= 2;
        if D == 30:
            M += 1;
            D = 1;
            L += 2;
        if W == 7:
            W = 1;
            L += 2;

    else:
        D += 1;

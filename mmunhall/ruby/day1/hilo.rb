rand = rand(10) + 1
guess = -1

while guess != rand
    print 'Enter a number between 1 and 10: '
    guess = Integer(gets)
    puts 'High. Guess again.' if guess > rand
    puts 'Low. Guess again.' if guess < rand
end

puts 'Got it! All done.'


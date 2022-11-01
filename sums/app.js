const readline = require('readline')

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
})

const question1 = () => {
//   return new Promise((resolve, reject) => {
    rl.question('q1 What do you think of Node.js? ', (answer) => {
      console.log(`Thank you for your valuable feedback: ${answer}`)
    //   resolve()
    // })
  })
}

const question2 = () => {
  return new Promise((resolve, reject) => {
    rl.question('q2 What do you think of Node.js? ', (answer) => {
      console.log(`Thank you for your valuable feedback: ${answer}`)
      resolve()
    })
  })
}

const main = async () => {
    for(let i=0;i<3;i++){
        await question1()
        // rl.close()
    }
}

main()
type P = Promise<number>

async function addTwoPromises(promise1: P, promise2: P): P {
    const a:number = await promise1;
    const b:number = await promise2;
    
    return new Promise((resolve) => {
        resolve(a+b);
    })
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
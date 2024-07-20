type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };

function argumentsLength(...args: JSONValue[]): number {
    let s: number = 0;
    for (let i = 0; i < args.length; i++) {
        s++;
    }
    return s;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */
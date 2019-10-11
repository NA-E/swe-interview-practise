/**
 * @param {string} J
 * @param {string} S
 * @return {number}
 */
var numJewelsInStones = function(J, S)  {
        const jewelArraySize = 122; //max ascii value of alphabet character is 122
        
        let jewels = Array(jewelArraySize).fill(0);
        
        for (let i = 0; i < J.length; i++) {
            jewels[J.charCodeAt(i)] = 1;
        }
        
        let jewelCount = 0;
        
        for (let i = 0; i < S.length; i++) {
            if (jewels[S.charCodeAt(i)]) {
                jewelCount++;
            }
        }
        
        return jewelCount;
};
document.addEventListener("DOMContentLoaded", function() {
    const cardNumberForm = document.querySelector("form .form-group")
    const cardNumber = document.querySelector("form .input-group input")
    const cardVendor = document.querySelector("form .input-group #type")

    console.log(cardVendor)

    function isValidCardNumber(cardNumber, vendor) {
        let regex;
        switch (vendor) {
            case 'V': {
                regex = new RegExp('^[0-9]{13,16}$')
                break
            }
            case 'M': {
                regex = new RegExp('^[0-9]{16}$')
                break
            }
            case 'A': {
                regex = new RegExp('^[0-9]{15}$')
                break
            }
            default: {
                return false;
            }
        }

        return regex.test(cardNumber)
    }

    function chooseVendor(number) {
        if (number.indexOf('4') === 0) {
            return 'V'
        } else if (number.indexOf('5') === 0) {
            return  'M'
        } else if (number.indexOf('34') === 0 || number.indexOf('37') === 0) {
            return  'A'
        }

        return ''
    }

    cardNumber.addEventListener("keyup", function (event) {
        const number = this.value
        const vendor = chooseVendor(number)

        cardVendor.innerText = vendor
        if (!isValidCardNumber(number, vendor)) {
            console.log("Error")
            cardNumberForm.classList.add('has-error')
        } else {
            cardNumberForm.classList.remove('has-error')
        }
    })
})
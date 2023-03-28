import React from 'react'
import { TextField } from '@mui/material'

interface Props {
    label: string;
    variant: string | any;
}

const TextFieldComponent: React.FC<Props> = ({label, variant}) => {
    return (
        <TextField label={label} variant={variant} />
    );
}

export default TextFieldComponent;


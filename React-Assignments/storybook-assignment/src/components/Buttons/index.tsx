import React from 'react'
import { Button as MuiButton } from '@mui/material'

interface Props {
    label: string;
    variant: string| any;
}

const ButtonComponent: React.FC<Props> = ({label, variant}) => {
    return (
        <MuiButton variant={variant}>
            {label}
        </MuiButton>
    );
}

export default ButtonComponent;


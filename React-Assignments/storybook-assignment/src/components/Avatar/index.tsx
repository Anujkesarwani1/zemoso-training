import React from 'react'
import { Avatar } from '@mui/material'

interface Props {
    src: string;
    alt: string;
}

const AvatarComponent: React.FC<Props> = ({src, alt}) => {
    return (
        <Avatar alt={alt} src={src} />
    );
}

export default AvatarComponent;

